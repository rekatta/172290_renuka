import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PatientService } from 'src/app/patient.service';
import { Appointment } from './Appointment';
import { PatientLoginComponent } from '../patient-login/patient-login.component';
import { Router } from '@angular/router';





 
@Component({
  selector: 'app-pateint-appointment',
  templateUrl: './pateint-appointment.component.html',
  styleUrls: ['./pateint-appointment.component.css']
})
export class PateintAppointmentComponent implements OnInit {

  doctorretrievalform:FormGroup;
  appointment: Appointment;
  constructor(private fb:FormBuilder,private service:PatientService,private route:Router) {
    this.createForm();

}
inCorrectDate:boolean=false;
availableDoctors:any;
displayDoctors:boolean=false;
selectedDoctor:any;
login:PatientLoginComponent;
status:boolean=false;


  ngOnInit() {
  }

  createForm(){
    this.doctorretrievalform=this.fb.group({
      patientDescripion:['',Validators.required],
      patientSpeciliztion:['',Validators.required],
      patientAddress:['',Validators.required],
      patientDate:['',Validators.required]


    })
  }

  retreival(){
        this.service.searchDoctors(this.doctorretrievalform.get('patientAddress').value,this.doctorretrievalform.get('patientSpeciliztion').value).subscribe((response)=>{
    
        this.availableDoctors=response;
        })
    

   

    
  console.log(this.availableDoctors.length)
  
  
  }


  makeAppointment(email:string){
    console.log("in make apppointment")
    for(let doctor of this.availableDoctors){  
      if(doctor.emailId==email){
       this.selectedDoctor=doctor;
      }

    }
    console.log(this.selectedDoctor);
    this.appointment=new Appointment(); 
    this.appointment.doctorEmail=this.selectedDoctor.emailId;
    this.appointment.location=this.doctorretrievalform.get('patientAddress').value;
    this.appointment.problem=this.doctorretrievalform.get('patientDescripion').value;
    this.appointment.patientEmail=this.service.currentPatient.email;
    this.appointment.doctorName=this.selectedDoctor.name;
    this.appointment.date=this.doctorretrievalform.get('patientDate').value;
    this.appointment.patientName=this.service.currentPatient.firstName+" "+this.service.currentPatient.lastName;
    this.service.makeAppointment(this.appointment).subscribe((response)=>{
      console.log(response);
      this.status=true;

    })


  
    

    


  }


}








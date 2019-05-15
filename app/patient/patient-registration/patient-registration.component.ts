import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PatientService } from 'src/app/patient.service';
import { Patient } from '../../patient';


@Component({
  selector: 'app-patient-registration',
  templateUrl: './patient-registration.component.html',
  styleUrls: ['./patient-registration.component.css']
})
export class PatientRegistrationComponent implements OnInit {


   status:boolean=false;
   regForm:FormGroup;
   response:any;
   constructor(private fb:FormBuilder,private service:PatientService) {
             this.createForm();

   }

  

  ngOnInit() { 
  

  }

  patient:Patient;

  createForm(){
    this.regForm=this.fb.group({
      PatientfirstName:['',Validators.required],
      PatientlastName:['',Validators.required],
      Patientusername:['',Validators.required], 
      Patientage:['',Validators.required],
      Patientgender:['',Validators.required],
      Patientemail: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
      Patientpassword:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ]
    
    })
  }


  register(){
    console.log(this.regForm.get('Patientage').value);
  
    this.patient=new Patient();
    this.patient.firstName=this.regForm.get('PatientfirstName').value;
    this.patient.lastName=this.regForm.get('PatientlastName').value;
    this.patient.age=this.regForm.get('Patientage').value;
    this.patient.gender=this.regForm.get('Patientgender').value;
    this.patient.userName=this.regForm.get('Patientusername').value;
    this.patient.password=this.regForm.get('Patientpassword').value;
    this.patient.email=this.regForm.get('Patientemail').value;

  
    

    this.service.registerPatient(this.patient).subscribe((response) =>{
      if(response!=null){
        this.status=true;
      }
      
      console.log(this.response)});

 // this.userAccount = new UserAccount();
  //console.log(this.userAccount)


}


    
      

  }



import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PatientService } from 'src/app/patient.service';
import { Router } from '@angular/router';
import { DoctorService } from '../../doctor/doctor.service';

@Component({
  selector: 'app-patient-login',
  templateUrl: './patient-login.component.html',
  styleUrls: ['./patient-login.component.css']
})
export class PatientLoginComponent implements OnInit {

  loginStatus:any=false;
  currentUser:any;
   loginForm:FormGroup;
  constructor(private fb:FormBuilder,private service:PatientService,private route:Router,private doctorService:DoctorService) { 
    this.createLoginForm();
  }
  response:any;
  ngOnInit() {

  }

  createLoginForm(){
    
    this.loginForm=this.fb.group({
      patientEmail:['',Validators.required],
      patientPassword:['',Validators.required]

    })
  }

  Login(){
   
    this.service.loginPatient(this.loginForm.get('patientEmail').value,this.loginForm.get('patientPassword').value).subscribe((response)=>{
      this.currentUser=response;
      console.log(this.currentUser)  
      if(this.currentUser!=null){
        this.doctorService.saveDoctor(null);
        this.service.savePatient(this.currentUser);
          this.route.navigateByUrl("patientHome")
    
        }
        else{
          this.loginStatus=true;
          this.route.navigateByUrl("patientLogin");
    
        }

      
    })
   



    

  }

}

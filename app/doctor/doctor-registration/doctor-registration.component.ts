import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {DoctorService} from 'src/app/doctor/doctor.service'
import { Doctor } from '../doctor';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doctor-registration',
  templateUrl: './doctor-registration.component.html',
  styleUrls: ['./doctor-registration.component.css']
})
export class DoctorRegistrationComponent implements OnInit {
  regForm:FormGroup;
  response:any;
    constructor(private fb:FormBuilder,private service:DoctorService,private route:Router) {
               this.createForm();
    }

  ngOnInit() {
  }
   doctor:Doctor;

  createForm(){
    this.regForm=this.fb.group({
      name:['',Validators.required],
      qulification:['',Validators.required], 
      location:['',Validators.required],
      experience:['',Validators.required],
      specilization:['',Validators.required],
      age:['',Validators.required],
      phonenumber:['',Validators.required],


      emailId: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
    
      password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ]
    })
  }

  registeredDoctor:any;


  register(){
  
    this.doctor=new Doctor();
    this.doctor.emailId=this.regForm.get('emailId').value;
    this.doctor.name=this.regForm.get('name').value;
    this.doctor.age=this.regForm.get('age').value;
    this.doctor.experience=this.regForm.get('experience').value;
    this.doctor.qualification=this.regForm.get('qulification').value;
    this.doctor.specilization=this.regForm.get('specilization').value;
    this.doctor.password=this.regForm.get('password').value;
    this.doctor.phoneNumber=this.regForm.get('phonenumber').value;
    this.doctor.location=this.regForm.get('location').value;

    console.log(this.doctor)

  
    

    this.service.registerDoctor(this.doctor).subscribe((response) =>{ 
      this.registeredDoctor=response;
      if(this.registeredDoctor!=null){
        this.route.navigateByUrl("doctorLogin");

       
      }
      
      console.log(this.registeredDoctor)});

 // this.userAccount = new UserAccount();
  //console.log(this.userAccount)


}
}

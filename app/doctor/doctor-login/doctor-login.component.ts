import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '../../../../node_modules/@angular/forms';
import { Router } from '../../../../node_modules/@angular/router';
import { DoctorService } from '../doctor.service';
import { PatientService } from '../../patient.service';

@Component({
  selector: 'app-doctor-login',
  templateUrl: './doctor-login.component.html',
  styleUrls: ['./doctor-login.component.css']
})
export class DoctorLoginComponent implements OnInit {
  currentDoctor: any;

  loginStatus:boolean=false;
  constructor(private fb: FormBuilder, private route: Router, private DoctorService:DoctorService,private PatientService:PatientService) { }
  loginForm: FormGroup;
  submitted: boolean = false;
  response: any;

  
  ngOnInit() {
    this.loginForm = this.fb.group({
    
      email: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
    
      password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ]
    
    });
  }

  check:boolean=false;
  
  onLogin(){
  console.log(this.loginForm);
    
    
this.DoctorService.loginDoctor(this.loginForm.get('email').value,this.loginForm.get('password').value).subscribe((response)=>
{
 
  console.log(response);
  this.currentDoctor=response;
  if(this.currentDoctor!=null){
    this.PatientService.savePatient(null);
    this.route.navigateByUrl("doctorHome");
    this.DoctorService.saveDoctor(response);
  }
  else{
    this.loginStatus=true;
    this.route.navigateByUrl("doctorLogin");
  }

})
}
}

import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AdminServiceService } from '../admin-service.service';
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  currentAdmin:any;
  adminForm:FormGroup;
  constructor(private fb:FormBuilder,private service:AdminServiceService,private route:Router) { }

  ngOnInit() {
   
    this.adminForm = this.fb.group({
    
      email: ['',[ Validators.required,Validators.pattern('[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
    
      password:['',[ Validators.required,Validators.maxLength(15),Validators.minLength(6),	Validators.pattern('^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]+$')] ]
    
    });
  }

  onLogin(){
    console.log(this.adminForm)
    this.service.login(this.adminForm.get('email').value,this.adminForm.get('password').value).subscribe((response)=>{
      this.currentAdmin=response;
      console.log(response);
      if(this.currentAdmin!=null){
        this.route.navigateByUrl('adminHome');
  
  
      }
      else{
        this.route.navigateByUrl('adminLogin');
      }
    })
    

  }

  }



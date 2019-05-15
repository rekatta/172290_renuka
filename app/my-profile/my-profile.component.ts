import { Component, OnInit } from '@angular/core';
import { PatientService } from '../patient.service';
import { Router } from '@angular/router';
import { DoctorService } from '../doctor/doctor.service';

@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent implements OnInit {

  constructor(private patientService:PatientService,private route:Router,private doctorService:DoctorService) { }
  currentPatient:any=null;
  currentDoctor:any=null;
  ngOnInit() {
    this.currentPatient=this.patientService.currentPatient;
    this.currentDoctor=this.doctorService.currentDoctor;
    console.log("in my profile")
    console.log(this.currentPatient);



  }

  logout(){
    console.log('in logout')
    if(this.currentPatient!=null){
    this.patientService.savePatient(null);
    this.route.navigateByUrl('patientLogin');
    }
    else{
    this.doctorService.saveDoctor(null);
    this.route.navigateByUrl('doctorLogin');
    } 


  }

}

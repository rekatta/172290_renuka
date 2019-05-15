import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-view-doctors',
  templateUrl: './view-doctors.component.html',
  styleUrls: ['./view-doctors.component.css']
})
export class ViewDoctorsComponent implements OnInit { 
  selected:boolean=false;
  selectedDoctor:any;
  appointmentList:any;

  doctorsList:any;

  constructor(private service:AdminServiceService) { }

  ngOnInit() {
    this.service.getAllDoctors().subscribe((response)=>{
      console.log(response);
      this.doctorsList=response;
    })



    

  }

  viewAppointments(email:string){
    for(let doctor of this.doctorsList){
      if(doctor.emailId==email){
        this.selected=true;
        this.selectedDoctor=doctor;
        this.appointmentList=doctor.apppointments

      }

      console.log(this.selectedDoctor);

    }

  }

  back(){
    this.selected=!this.selected;
  }

}

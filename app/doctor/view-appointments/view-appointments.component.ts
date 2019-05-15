import { Component, OnInit } from '@angular/core';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-view-appointments',
  templateUrl: './view-appointments.component.html',
  styleUrls: ['./view-appointments.component.css']
})
export class ViewAppointmentsComponent implements OnInit {
  appointmentList:any;

  constructor(private service:DoctorService) { }

  ngOnInit() {
    this.service.viewAppointments().subscribe((response)=>{
      this.appointmentList=response;
      console.log("in view appointments")
      console.log(response); 
    })

    this.appointmentList=this.service.currentDoctor.appointments
    console.log(this.appointmentList)


  }

}

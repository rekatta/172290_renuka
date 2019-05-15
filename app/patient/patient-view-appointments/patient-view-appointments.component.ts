import { Component, OnInit } from '@angular/core';
import { PatientService } from 'src/app/patient.service';

@Component({
  selector: 'app-patient-view-appointments',
  templateUrl: './patient-view-appointments.component.html',
  styleUrls: ['./patient-view-appointments.component.css']
})
export class PatientViewAppointmentsComponent implements OnInit {
  srno:number=0;
  appointmentList:any;
  constructor(private service:PatientService) { }

  ngOnInit() {
    this.service.viewAppointments().subscribe((response)=>{
     this.appointmentList=response;

    })

  }

}

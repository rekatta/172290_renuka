import { Component, OnInit } from '@angular/core';
import { AdminServiceService } from '../admin-service.service';

@Component({
  selector: 'app-view-patients',
  templateUrl: './view-patients.component.html',
  styleUrls: ['./view-patients.component.css']
})
export class ViewPatientsComponent implements OnInit {
  patientList:any;
  selected:boolean=false;
  selectedPatient:any;
  appointmentList:any;
  constructor(private service:AdminServiceService) { }

  ngOnInit() {
    this.service.getAllPatients().subscribe((response)=>{
      console.log(response);
      this.patientList=response;
    })
  }

  viewAppointments(email:string){
    for(let patient of this.patientList){
      if(patient.email==email){
        this.selected=true;
        this.selectedPatient=patient;

        this.appointmentList=patient.appointments
        console.log(this.appointmentList)

      }

    }

  }

  back(){
    this.selected=!this.selected;
  }

}

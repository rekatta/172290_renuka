import { Component, OnInit } from '@angular/core';
import { PatientService } from './patient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  ngOnInit(): void {
    this.currentUser=this.patientService.currentPatient
  }
  title = 'doctorApp';
  currentUser:any;
  constructor(private patientService:PatientService ){


  }
}

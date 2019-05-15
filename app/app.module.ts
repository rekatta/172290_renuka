import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { PatientComponent } from './patient/patient.component';
import { DoctorComponent } from './doctor/doctor.component';
import { AdminComponent } from './admin/admin.component';
import { PatientRegistrationComponent } from './patient/patient-registration/patient-registration.component';
import { PatientService } from './patient.service';
import { HttpClientModule } from '@angular/common/http';
import { AlertModule } from 'ngx-bootstrap';
import { PatientLoginComponent } from './patient/patient-login/patient-login.component';
import { PatientHomeComponent } from './patient/patient-home/patient-home.component';
import { PateintAppointmentComponent } from './patient/pateint-appointment/pateint-appointment.component';
import { PatientViewAppointmentsComponent } from './patient/patient-view-appointments/patient-view-appointments.component';
import { DoctorRegistrationComponent } from './doctor/doctor-registration/doctor-registration.component';
import { DoctorLoginComponent } from './doctor/doctor-login/doctor-login.component';
import { DoctorHomeComponent } from './doctor/doctor-home/doctor-home.component';
import { ViewAppointmentsComponent } from './doctor/view-appointments/view-appointments.component';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import { ViewDoctorsComponent } from './admin/view-doctors/view-doctors.component';
import { ViewPatientsComponent } from './admin/view-patients/view-patients.component';
import { AdminHomeComponent } from './admin/admin-home/admin-home.component';
import { MyProfileComponent } from './my-profile/my-profile.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';


@NgModule({
  declarations: [
    AppComponent,PatientComponent,DoctorComponent,AdminComponent, PatientRegistrationComponent, PatientLoginComponent, PatientHomeComponent, PateintAppointmentComponent, PatientViewAppointmentsComponent,DoctorRegistrationComponent,DoctorLoginComponent, DoctorHomeComponent, ViewAppointmentsComponent, AdminLoginComponent, ViewDoctorsComponent, ViewPatientsComponent, AdminHomeComponent, MyProfileComponent, HomeComponent, ContactComponent, AboutComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,AlertModule.forRoot(),
    

    RouterModule.forRoot([
        {path:'',redirectTo:'userHome',pathMatch:'full'},
        {path:'patient',component:PatientComponent},
        {path:'doctor',component:DoctorComponent},
        {path:'admin',component:AdminComponent},
        {path:'patientRegistration',component:PatientRegistrationComponent},
        {path:'patientLogin',component:PatientLoginComponent},
        {path:'patientHome',component:PatientHomeComponent},
        {path:'patientTakeAppointment',component:PateintAppointmentComponent},
        {path:'patientViewApppointments',component:PatientViewAppointmentsComponent},
        {path:'doctorRegistration',component:DoctorRegistrationComponent},
        {path:'doctorLogin',component:DoctorLoginComponent},
        {path:'doctorHome',component:DoctorHomeComponent},
        {path:'doctorViewApppointments',component:ViewAppointmentsComponent},
        {path:'adminLogin',component:AdminLoginComponent},
        {path:'adminHome',component:AdminHomeComponent},
        {path:'viewAllPatients',component:ViewPatientsComponent},
        {path:'viewAllDoctors',component:ViewDoctorsComponent},
        {path:'myProfile',component:MyProfileComponent},
        {path:'home',component:AppComponent},
        {path:'userHome',component:HomeComponent},
        {path:'contact',component:ContactComponent},
        {path:'about',component:AboutComponent}
        


      

    ])
  ],  
  providers: [PatientService],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PateintAppointmentComponent } from './pateint-appointment.component';

describe('PateintAppointmentComponent', () => {
  let component: PateintAppointmentComponent;
  let fixture: ComponentFixture<PateintAppointmentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PateintAppointmentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PateintAppointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

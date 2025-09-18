import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Complaintmanagement } from './complaintmanagement';

describe('Complaintmanagement', () => {
  let component: Complaintmanagement;
  let fixture: ComponentFixture<Complaintmanagement>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Complaintmanagement]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Complaintmanagement);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

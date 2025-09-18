import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Reportsmanagement } from './reportsmanagement';

describe('Reportsmanagement', () => {
  let component: Reportsmanagement;
  let fixture: ComponentFixture<Reportsmanagement>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Reportsmanagement]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Reportsmanagement);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

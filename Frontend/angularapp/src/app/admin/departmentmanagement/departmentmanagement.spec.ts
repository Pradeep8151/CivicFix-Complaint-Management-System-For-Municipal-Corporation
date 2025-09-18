import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Departmentmanagement } from './departmentmanagement';

describe('Departmentmanagement', () => {
  let component: Departmentmanagement;
  let fixture: ComponentFixture<Departmentmanagement>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Departmentmanagement]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Departmentmanagement);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

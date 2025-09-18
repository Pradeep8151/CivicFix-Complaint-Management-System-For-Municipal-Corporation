import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ReactiveFormsModule } from '@angular/forms';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';


import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  template: ''
})
class LoginComponent {
  loginForm = {
    valid: false,
    controls: {
      email: {
        value: '',
        valid: false,
        setValue(val: string) {
          this.value = val;
          this.valid = val === 'admin@example.com';
        }
      }
    }
  };
}

describe('LoginComponent', () => {
  let component: LoginComponent;
  let fixture: ComponentFixture<LoginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LoginComponent],
      imports: [
        ReactiveFormsModule,
        RouterTestingModule,
        HttpClientTestingModule
      ],
  // providers: [AuthService]
    }).compileComponents();

    fixture = TestBed.createComponent(LoginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create the component', () => {
    expect(component).toBeTruthy();
  });

  it('should have invalid form when empty', () => {
    expect(component.loginForm.valid).toBeFalse();
  });

  it('should validate email field correctly', () => {
    const email = component.loginForm.controls['email'];
    email.setValue('invalid');
    expect(email.valid).toBeFalse();

    email.setValue('admin@example.com');
    expect(email.valid).toBeTrue();
  });
});

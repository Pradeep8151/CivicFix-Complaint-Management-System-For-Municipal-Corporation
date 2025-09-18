
import { Routes } from '@angular/router';
import { LoginComponent } from './admin/login/login';
import { Dashboard } from './admin/dashboard/dashboard';
import { Complaintmanagement } from './admin/complaintmanagement/complaintmanagement';
import { Departmentmanagement } from './admin/departmentmanagement/departmentmanagement';
import { Reportsmanagement } from './admin/reportsmanagement/reportsmanagement';
import { UserManagement } from './admin/user-management/user-management';
import { Landingpage } from './user/landingpage/landingpage';

export const routes: Routes = [
    { path: 'landing', component: Landingpage },
    { path: 'home', loadComponent: () => import('./user/home/home').then(m => m.HomeComponent) },
    { path: 'submit-complaint', loadComponent: () => import('./user/submit-complaint/submit-complaint').then(m => m.SubmitComplaintComponent) },
    { path: 'track-status', loadComponent: () => import('./user/track-status/track-status').then(m => m.TrackStatusComponent) },
    { path: 'user-login', loadComponent: () => import('./user/login/login').then(m => m.UserLoginComponent) },

    { path: '', redirectTo: 'landing', pathMatch: 'full' },

	{
		path: 'admin',
		children: [
			{ path: 'login', component: LoginComponent },
			{ path: 'dashboard', component: Dashboard },
			{ path: 'complaint-management', component: Complaintmanagement },
			{ path: 'department-management', component: Departmentmanagement },
			{ path: 'reports-management', component: Reportsmanagement },
			{ path: 'user-management', component: UserManagement },

		]  
	},
	{ path: '**', redirectTo: 'admin/login' }
];  

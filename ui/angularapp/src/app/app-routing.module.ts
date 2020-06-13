import { AuthguardService } from './auth/authguard.service';
import { LoginComponent } from './login/login.component';
import { QuizhomeComponent } from './quiz/quizhome/quizhome.component';
import { DeptComponent } from './dept/dept.component';
import { DirectiveComponent } from './directive/directive.component';
import { HomeComponent } from './home/home.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BasicsComponent } from './basics/basics.component';


const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
    pathMatch:'full',

  },
  {
    path: 'login',
    component: LoginComponent

  },
  {
    path: 'home',
    component: HomeComponent,
    canActivate:[AuthguardService]
  },
  {
    path: 'basics',
    component: BasicsComponent,
    canActivate:[AuthguardService]

  },
  {
    path: 'directives',
    component: DirectiveComponent,
    canActivate:[AuthguardService]
  },
  {
    path: 'dept',
    component: DeptComponent,
    canActivate:[AuthguardService]
  },
  {
    path: 'empstat',
    loadChildren: () => import('./empstat/empstat.module').then(m => m.EmpstatModule),
    canActivate:[AuthguardService]
  },
  {
    path: 'cbook',
    loadChildren: () => import('./cbook/cbook.module').then(m => m.CbookModule),
    canActivate:[AuthguardService]
  },
  {
    path:'quiz',
    component:QuizhomeComponent,
    canActivate:[AuthguardService]
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

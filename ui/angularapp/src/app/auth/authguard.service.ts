import { AuthService } from './auth.service';
import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthguardService implements CanActivate {

  constructor(private authService:AuthService,private router:Router) { }
  canActivate(){

        if(this.authService.isUserLoggedIn())
            return true;
        else{
            this.router.navigate(['']);
            return false;

        }

  }
}

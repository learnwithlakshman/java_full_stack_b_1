import { Router } from '@angular/router';
import { AuthService, UserMinProfile } from './../auth/auth.service';
import { Component, OnInit } from '@angular/core';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  userMinProfile:UserMinProfile;
  constructor(private authService:AuthService,private router:Router) { }

  ngOnInit(): void {
        this.authService.userProfileEvent.subscribe(resp=>{
          this.userMinProfile = resp;
        })
       if(this.authService.isUserLoggedIn()){
           this.userMinProfile = this.authService.getUserMinProfile();
       }
  }

  logout(){
      this.authService.logout();
      this.router.navigate(['/'])
  }

}

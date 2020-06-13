import { Injectable, EventEmitter, Output } from '@angular/core';

export interface User{
    username:string,
    email:string,
    password:string,
    role:string
}

export interface UserMinProfile{
  username:string,
  email:string,
  role:string
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {


  userProfileEvent=new EventEmitter();
  userProfile:UserMinProfile;
  users:User[] = [
      {
          "username":"User1",
          "email":"user1@lwl.com",
          "password":"user1",
          "role":"user"

      },
      {
        "username":"User2",
        "email":"user2@lwl.com",
        "password":"user2",
        "role":"user"
      },
      {
        "username":"admin",
        "email":"admin@lwl.com",
        "password":"admin",
        "role":"admin"
      }
  ]
  constructor() {
      if(this.isUserLoggedIn()){
        this.userProfile = this.getUserProfile();
        this.userProfileEvent.emit(this.userProfile);
      }

   }

  loadUserByEmail(email:string){
      return this.users.filter(user=>user.email === email)[0];
  }

  login(email:string,password:string){
      let user:User = this.loadUserByEmail(email);
      if(user != null){
          if(user.password === password){
            this.userProfile = {"email":user.email,"username":user.username,"role":user.role};
            localStorage.setItem("user",JSON.stringify(this.userProfile));
            this.userProfileEvent.emit(this.userProfile);
            return true;
          }
      }
      return false;
  }

  getUserProfile(){
    return JSON.parse(localStorage.getItem("user"));
  }
  isUserLoggedIn(){
    return (localStorage.getItem("user") !=null );
  }
  logout(){
    this.userProfileEvent.emit();
    localStorage.removeItem("user");
  }
  getUserMinProfile(){
    return this.userProfile;
  }

}

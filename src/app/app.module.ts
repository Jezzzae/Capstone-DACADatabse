import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { LawyerComponent } from './lawyer/lawyer.component';
import { HttpClientModule } from '@angular/common/http';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { ResourceRoutingModule } from './resources/resources.routing.module';
import { ResourceComponent } from './resources/resource.component';
import { GrantComponent } from './grant/grant.component';
import { ClinicComponent } from './clinic/clinic.component';
import { HomepageComponent } from './homepage/homepage.component';



@NgModule({
  declarations: [
    AppComponent,
    ResourceComponent,
    LawyerComponent,
    GrantComponent,
    ClinicComponent,
    HomepageComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ResourceRoutingModule,
    NgbModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

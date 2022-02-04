import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

import { ResourceComponent } from "./resource.component";
import { ClinicComponent } from "../clinic/clinic.component";
import { NewsComponent } from '../news/news.component';
import { LawyerComponent} from "../lawyer/lawyer.component";
import { GrantComponent } from "../grant/grant.component";

const resourcesRoutes: Routes = [
    {
        path: 'resources',
        component: ResourceComponent,
        children:[
             //http://localhost:4200/resources/clinic
      {
        path: 'clinic',
        component:ClinicComponent
      },
      //http://localhost:4200/resources/news
      {
        path: 'news',
        component:NewsComponent
      },
       //http://localhost:4200/resources/grants
      {
        path: 'grant',
        component:GrantComponent
      },
      //http://localhost:4200/resources/lawyer
      {
        path: 'lawyer',
        component:LawyerComponent
          },
        ]
    }
];

@NgModule({
    imports:[
        RouterModule.forChild(resourcesRoutes)
    ],
    exports:[RouterModule]
})
export class ResourceRoutingModule{}
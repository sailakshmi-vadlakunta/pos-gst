import { Component } from '@angular/core';
import {MatGridListModule} from '@angular/material/grid-list';
import { MatSidenav, MatSidenavContainer, MatSidenavContent} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list';
import { RouterOutlet } from '@angular/router';
import { RouterModule } from '@angular/router';
import { MatToolbar } from '@angular/material/toolbar';

@Component({
  selector: 'app-root',
 imports: [MatGridListModule, MatSidenav, MatSidenavContainer, MatListModule, MatSidenavContent,RouterOutlet, RouterModule,MatToolbar],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'pos-ui';

  test(){
    console.info("----&&*DJHASJHG")
  }
}

import { Component } from '@angular/core';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatButtonModule} from '@angular/material/button';
import { AppService } from '../app.service';

@Component({
  selector: 'app-category',
  imports:[FormsModule, MatInputModule, MatFormFieldModule,FormsModule,MatIconModule,MatDividerModule,MatButtonModule],
  templateUrl: './category.component.html',
  styleUrl: './category.component.css',
})

export class CategoryComponent {
  constructor(private appService: AppService) {
    
  }

  createCat(){
    console.log("----------begin")
    this.appService.createCategory();
  }
}

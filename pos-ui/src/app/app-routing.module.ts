import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CategoryComponent } from './category/category.component'; 
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
import { SalesComponent } from './sales/sales.component';

export const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'login'},
  { path: 'login', component: LoginComponent },
  { path: 'category', component: CategoryComponent},
  { path: 'product', component: ProductComponent},
  { path: 'sales', component: SalesComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
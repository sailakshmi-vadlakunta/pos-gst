import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError, map } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http: HttpClient) { }

  createCategory() {
  //   let url = "http://localhost:8080/pos/v1/category";
  //   const httpOptions =  new HttpHeaders({
  //       'Content-Type': 'application/json',
  //       // 'Authorization': 'Basic ' + localStorage.getItem('ACCESS_TOKEN')
  //     })
  // const body = {
  //   "categoryName" : "luxury",
  //   "gst" : 28
  // }
    
  //   this.http.post(url, body, { headers: httpOptions });
  //   console.log("------end");
  let url = "http://localhost:8080/pos/v1/category/categoryNames";
  const httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',

      // 'Authorization': 'Basic ' + localStorage.getItem('ACCESS_TOKEN')
    })
  };
  return this.http.get(url, httpOptions).pipe(
    map(data => data),
    catchError((err) => {
      console.error(err);
      throw err;
    }));

  }
}

// Step 2

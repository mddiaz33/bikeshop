import { Component, OnInit } from '@angular/core';
import { BikeService } from '../../services/bike.service';
import {ActivatedRoute} from '@angular/router'
@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent implements OnInit {
  public bikeReg: any;

  constructor(private bikeService: BikeService, private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    //get id off of route
     const id = this.route.snapshot.params['id'];
    this.getBikeReg(id);
  }
    getBikeReg(id:number){
    this.bikeService.getBike(id).subscribe(
      data=> {
        this.bikeReg = data;
      },
      err => console.error(err),
      () => console.log('bikes loaded')
    );
  }

}

import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { Location } from '@angular/common';
@Component({
  selector: 'app-header',
  imports: [RouterModule],
  templateUrl: './header.html',
  styleUrl: './header.css',
})
export class Header {
goBack() {
throw new Error('Method not implemented.');
}

}
export class HeaderComponent {

  constructor(private location: Location) {}

  goBack() {
    this.location.back();
  }
}

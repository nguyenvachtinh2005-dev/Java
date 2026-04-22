import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-admin',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './admin.html',
  styleUrl: './admin.css'
})
export class Admin implements OnInit {

  user: any;

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('user') || '{}');
  }
}
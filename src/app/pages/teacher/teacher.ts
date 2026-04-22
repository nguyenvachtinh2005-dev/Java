import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-teacher',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './teacher.html',
  styleUrl: './teacher.css'
})
export class Teacher implements OnInit {

  user: any;

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('user') || '{}');
  }
}
import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-student',
  standalone: true,   
  imports: [CommonModule],
  templateUrl: './student.html',
  styleUrl: './student.css'
})
export class Student implements OnInit {

  user: any;

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('user') || '{}');
  }
}
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './register.html',
  styleUrl: './register.css'
})
export class RegisterComponent {

  name = '';
  email = '';
  password = '';
  role = 'student';

  constructor(private http: HttpClient) {}

  register() {
    this.http.post('http://localhost:3000/api/auth/register', {
      name: this.name,
      email: this.email,
      password: this.password,
      role: this.role
    }).subscribe({
      next: (res: any) => {
        alert('Đăng ký thành công');
        window.location.href = '/login';
      },
      error: (err) => {
        alert('Lỗi đăng ký');
        console.error(err);
      }
    });
  }
}
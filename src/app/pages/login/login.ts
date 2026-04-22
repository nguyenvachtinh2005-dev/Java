import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class LoginComponent {

  email = '';
  password = '';

  constructor(private http: HttpClient) {}

  login() {
    console.log("Đang login...");

    this.http.post('http://localhost:3000/api/auth/login', {
      email: this.email,
      password: this.password
    }).subscribe({
      next: (res: any) => {
        console.log("Response:", res);

        localStorage.setItem('token', res.token);
        localStorage.setItem('user', JSON.stringify(res.user));

        // 🔥 redirect role
        if (res.user.role === 'admin') {
          window.location.href = '/admin';
        } else if (res.user.role === 'teacher') {
          window.location.href = '/teacher';
        } else {
          window.location.href = '/student';
        }
      },

      error: (err) => {
        console.error("Lỗi login:", err);

        if (err.status === 0) {
          alert("Không kết nối được server");
        } else if (err.status === 401) {
          alert("Sai tài khoản hoặc mật khẩu");
        } else {
          alert("Lỗi hệ thống");
        }
      }
    });
  }
}
import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../../service/clientes.service';
import { Cliente } from '../../models/cliente';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-clientes',
  templateUrl: './lista-clientes.component.html',
  styleUrls: ['./lista-clientes.component.css']
})
export class ListaClientesComponent implements OnInit {


  clientes: Cliente[] = [];

  constructor(
    private clienteService: ClienteService,
    private toastr: ToastrService,
    private router: Router
    ) { }

  ngOnInit() {
    this.cargarClientes();
  }

  cargarClientes(): void {
    this.clienteService.lista().subscribe(
      data => {
        this.clientes = data;
      },
      err => {
        console.log(err);
      }
    );
  }

  borrar(id: number) {
    this.clienteService.delete(id).subscribe(
      data => {
        this.toastr.success('Cliente Eliminado', 'OK', {
          timeOut: 3000, positionClass: 'toast-top-center'
        });
        this.cargarClientes();
      },
      err => {
        this.toastr.error(err.error.mensaje, 'Fail', {
          timeOut: 3000,  positionClass: 'toast-top-center',
        });
      }
    );
  }

}

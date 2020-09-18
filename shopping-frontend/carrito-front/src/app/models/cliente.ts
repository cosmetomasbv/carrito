export class Cliente {
    id?: number;
    nombre: string;
    gastoMes: number;
    tipoCliente: string;

    constructor(nombre: string, gastoMes: number, tipoCliente: string) {
        this.nombre = nombre;
        this.gastoMes = gastoMes;
        this.tipoCliente = tipoCliente;
    }
}



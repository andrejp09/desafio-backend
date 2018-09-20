package br.com.projuris;

import java.util.List;

public interface Calculo {
    List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios);

    List<CustoDepartamento> custoPorDepartamento(List<Funcionario>
                                                         funcionarios);
}
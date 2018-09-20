package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MyCalculo implements Calculo {

    @Override
    public List<CustoCargo> custoPorCargo(List<Funcionario> funcionarios) {

        List<CustoCargo> custoCargos = new ArrayList<>();

        Map<String, List<Funcionario>> collect = funcionarios
                .stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo));

        collect.values()
                .forEach(a -> {
                    CustoCargo custoCargo = new CustoCargo();
                    custoCargo.setDescricao(a.get(0).getCargo());
                    a.stream()
                            .map(Funcionario::getSalario)
                            .reduce(BigDecimal::add)
                            .ifPresent(custoCargo::setCusto);
                    custoCargos.add(custoCargo);
                });
        return custoCargos;
    }

    @Override
    public List<CustoDepartamento> custoPorDepartamento(List<Funcionario> funcionarios) {

        List<CustoDepartamento> custoDepartamentos = new ArrayList<>();

        Map<String, List<Funcionario>> collect = funcionarios
                .stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        collect.values()
                .forEach(a -> {
                    CustoDepartamento custoDepartamento = new CustoDepartamento();
                    custoDepartamento.setDescricao(a.get(0).getDepartamento());
                    a.stream()
                            .map(Funcionario::getSalario)
                            .reduce(BigDecimal::add)
                            .ifPresent(custoDepartamento::setCusto);
                    custoDepartamentos.add(custoDepartamento);

                });
        return custoDepartamentos;
    }
}

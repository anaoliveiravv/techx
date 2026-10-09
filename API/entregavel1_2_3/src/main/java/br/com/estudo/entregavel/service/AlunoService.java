package br.com.estudo.entregavel.service;

import br.com.estudo.entregavel.dto.AlunoRequest;
import br.com.estudo.entregavel.dto.AlunoResponse;
import br.com.estudo.entregavel.entity.Aluno;
import br.com.estudo.entregavel.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public AlunoResponse criar(AlunoRequest request) {
        Aluno aluno = new Aluno();
        aluno.setNome(request.getNome());
        aluno.setIdade(request.getIdade());
        aluno.setRa(request.getRa());
        return converter(alunoRepository.save(aluno));
    }

    public List<AlunoResponse> listarTodos() {
        List<Aluno> alunos = alunoRepository.findAll();
        List<AlunoResponse> respostas = new ArrayList<>();
        for (Aluno aluno : alunos) {
            respostas.add(converter(aluno));
        }
        return respostas;
    }

    public Optional<AlunoResponse> buscarPorId(Long id) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            return Optional.of(converter(alunoOptional.get()));
        } else {
            return Optional.empty();
        }
    }

    public List<AlunoResponse> buscarPorNome(String nome) {
        List<Aluno> alunos = alunoRepository.findByNomeContainingIgnoreCase(nome);
        List<AlunoResponse> respostas = new ArrayList<>();
        for (Aluno aluno : alunos) {
            respostas.add(converter(aluno));
        }
        return respostas;
    }

    public boolean atualizar(Long id, AlunoRequest request) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            Aluno aluno = alunoOptional.get();
            aluno.setNome(request.getNome());
            aluno.setIdade(request.getIdade());
            aluno.setRa(request.getRa());
            alunoRepository.save(aluno);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir(Long id) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            alunoRepository.delete(alunoOptional.get());
            return true;
        } else {
            return false;
        }
    }

    private AlunoResponse converter(Aluno aluno) {
        return new AlunoResponse(aluno.getId(), aluno.getNome(), aluno.getIdade(), aluno.getRa());
    }
}

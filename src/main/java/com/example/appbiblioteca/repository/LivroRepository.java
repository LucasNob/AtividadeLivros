package com.example.appbiblioteca.repository;

import java.util.HashMap;

import com.example.appbiblioteca.model.livro;

import org.springframework.stereotype.Repository;

/**
 * LivroRepository
 */
@Repository
public class LivroRepository {

public HashMap<Integer,livro> livros = new HashMap<Integer,livro>();
int ultimoId=0;

public LivroRepository()
{
    livros.put(0,new livro(0, "livro A", "editora A", 2000, 4));
    livros.put(1,new livro(1, "livro B", "editora B", 2001, 40));
    livros.put(2,new livro(2, "livro C", "editora A", 2020, 400));
    livros.put(3,new livro(3, "livro D", "editora B", 2003, 4000));
    livros.put(4,new livro(4, "livro E", "editora C", 2018, 40000));
    livros.put(5,new livro(5, "livro F", "editora C", 2011, 400000));
    ultimoId = livros.size();
}

public livro getLivroById(int id)
{
    return livros.get(id);
}
public HashMap<Integer,livro> getLivros()
{
    return livros;
}
public void novoLivro(String n,String ed,int lan,int est)
{
    livros.put(ultimoId,new livro(ultimoId, n, ed, lan, est));
    ultimoId++;
}
public boolean removerLivro(int id)
{
    if(livros.containsKey(id))
    {
        livros.remove(id); 
         return true;
    }
return false;
}
}
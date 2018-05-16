package com.example.repository;

import com.example.entity.Pedido;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public class PedidoRepositoryImpl implements PedidoRepository{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int updateDomain(String domain, boolean displayAds) {

/*        Query query = new Query(Criteria.where("domain").is(domain));
        Update update = new Update();
        update.set("displayAds", displayAds);

        WriteResult result = mongoTemplate.updateFirst(query, update, Pedido.class);

        if(result!=null)
            return result.getN();
        else*/
            return 0;

    }

    @Override
    public <S extends Pedido> S save(S s) {
        mongoTemplate.save(s);
        return null;
    }

    @Override
    public Optional<Pedido> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }


    @Override
    public <S extends Pedido> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public List<Pedido> findAll() {
        return mongoTemplate.findAll(Pedido.class);
    }

    @Override
    public Iterable<Pedido> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Pedido pedido) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pedido> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Pedido> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends Pedido> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Pedido> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pedido> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pedido> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pedido> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pedido> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Pedido> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Pedido> S insert(S s) {
        return null;
    }

    @Override
    public Page<Pedido> findAll(Pageable pageable) {
        return null;
    }
}

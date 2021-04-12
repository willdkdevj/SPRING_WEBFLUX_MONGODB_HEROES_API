package br.com.supernova.heroesapi.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "br.com.supernova.heroesapi.repository")
public class MongoConfiguration extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongodb.port}")
    private String mongoDBPort;

    @Value("${spring.data.mongodb.database}")
    private String mongoDBDbName;

    @Override
    public MongoClient reactiveMongoClient(){
        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {
        return mongoDBDbName;
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate(){
        return new ReactiveMongoTemplate(
                reactiveMongoClient(),
                getDatabaseName()
        );
    }
}


package com.lambdaschool.orders.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;
}

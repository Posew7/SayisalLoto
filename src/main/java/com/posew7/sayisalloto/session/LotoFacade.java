package com.posew7.sayisalloto.session;

import com.posew7.sayisalloto.entity.Loto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LotoFacade extends AbstractFacade<Loto> {

    @PersistenceContext(unitName = "com.posew7_SayisalLoto_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LotoFacade() {
        super(Loto.class);
    }

}

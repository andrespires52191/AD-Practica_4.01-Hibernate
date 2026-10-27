package dao;

import idao.ICourseMaterialDao;
import models.CourseMaterial;

public class CourseMateriaDao extends Dao<CourseMaterial, Integer> implements ICourseMaterialDao {
    @Override
    public CourseMaterial find(Integer id) {
        CourseMaterial courseMaterial = (CourseMaterial) em.find(CourseMaterial.class, id);
        return courseMaterial;
    }
}

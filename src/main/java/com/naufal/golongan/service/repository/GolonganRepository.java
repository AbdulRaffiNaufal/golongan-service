/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naufal.golongan.service.repository;

import com.naufal.golongan.service.entity.Golongan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author IIISI
 */
@Repository
public interface GolonganRepository extends JpaRepository<Golongan, Long>{
    public Golongan findByGolonganId(Long golonganId);
}

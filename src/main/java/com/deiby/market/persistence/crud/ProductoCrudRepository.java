package com.deiby.market.persistence.crud;

import com.deiby.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(Integer idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, Boolean estado);
    Producto findByEstadoEquals(Boolean estado);
    Optional<List<Producto>> findByPrecioVentaLessThanAndEstado(int precioVenta, Boolean estado);
}

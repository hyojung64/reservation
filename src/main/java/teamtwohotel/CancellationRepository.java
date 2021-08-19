package hotelone;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface CancellationRepository extends PagingAndSortingRepository<Cancellation, Long>{

	Cancellation findByOrderId(Long id);


}
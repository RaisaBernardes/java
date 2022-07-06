package _1M_annotations_e_GarbageCollector;


@interface InformacaoAula {

	String autor();
	
	int aulaNumero();
	
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";
}
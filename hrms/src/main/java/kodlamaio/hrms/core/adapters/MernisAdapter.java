package kodlamaio.hrms.core.adapters;

public class MernisAdapter implements MernisService{

	@Override
	public boolean userİnformationValidation(String firstName, String lastName, String identityNumber,
			String birthYear) {
     if(firstName.length()> 6 && lastName.length()> 6 && identityNumber.length() == 11 ) {
			
			System.out.println("Kullanıcı bilgileri doğrulaması başarılı!");
			return true;
		}else {
			
			System.out.println("Kullanıcı bilgileri doğrulaması başarısız! Lütfen bilgilerinizi gözden geçiriniz.");
			return false;
		}
		
		
	}

}

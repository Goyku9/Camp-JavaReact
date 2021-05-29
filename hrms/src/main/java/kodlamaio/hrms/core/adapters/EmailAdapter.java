package kodlamaio.hrms.core.adapters;

import java.util.regex.Pattern;

public class EmailAdapter implements EmailService{

	@Override
	public boolean emailFormat(String email) {
 final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@(.+)$";
	    
	    if (!Pattern.matches(EMAIL_PATTERN, email )) {
	    	
	        return true;
	    } else {
	    	
	        return false;
	    }
	}

	@Override
	public boolean emailCheck(String email) {
		if(!emailFormat(email)) {
			System.out.println("E-posta doğrulaması gönderilemedi. Lütfen doğru bir e-posta giriniz!");
			return false;
		}else {
			System.out.println("E-posta doğrulaması başarıyla gönderilmiştir. Lütfen e-posta kutunuzu kontrol ediniz.");
			return true;
		}
	}

}

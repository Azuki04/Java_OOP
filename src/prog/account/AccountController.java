package prog.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class AccountController {
    @Autowired
	AccountRepository accountRepository;   


    @GetMapping("")
	public ResponseEntity<List<Account>> getAllProducts(@RequestParam(required = false) String firsname) {
		List<Account> accounts = new ArrayList<Account>();
		return ResponseEntity.ok(accounts);
	}
}

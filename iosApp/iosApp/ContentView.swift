import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()

    var thecounter = FancyCounter()
    
    @State var thenametext = ""
    
    @State var firstname = ""
    @State var lastname = ""
        
	var body: some View {
        VStack {
            Text(thenametext)
            TextField("", text: $firstname)
            TextField("", text: $lastname)
            Button(action: {
                var someone = Person()
                someone.firstname = firstname
                someone.lastname = lastname
                
                //thenametext = someone.getfullname()
                
                thenametext = String(thecounter.letsadd())
                
                /*
                thecounter.othernumber {
                    thenametext = String(thecounter.thenumber)
                }
                 */
            }) {
                Text("Klick")
            }
        }.onAppear(perform: {
            thenametext = String(thecounter.getnumber())
        })
    }
    
    func dostuff()
    {
        var someone = Person()
        print(someone.getfullname())
    }
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
